package com.codevivek.jdbexample.redhatjdgdemo.caching;

import org.infinispan.client.hotrod.DefaultTemplate;
import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.configuration.Configuration;
import org.infinispan.client.hotrod.configuration.ConfigurationBuilder;
import org.infinispan.commons.marshall.JavaSerializationMarshaller;



public class DataGridCacheHelper {

    private static RemoteCacheManager remoteCacheManager;

    public static boolean isCacheServerRunning() {
        return remoteCacheManager.isStarted();
    }

    public static void initCache(){
        ConfigurationBuilder builder = new ConfigurationBuilder();
        builder.marshaller(JavaSerializationMarshaller.class);
        builder.addJavaSerialWhiteList("com.codevivek").build();
        Configuration configuration = builder.build();
        remoteCacheManager = new RemoteCacheManager(configuration);
    }

    public static RemoteCacheManager getRemoteCacheManagerInstance() {
        if (remoteCacheManager != null) {
            return remoteCacheManager;
        } else {
            DataGridCacheHelper.initCache();
            return remoteCacheManager;
        }
    }

    public <K,V> RemoteCache<K,V> getRemoteCache(String cacheName, RemoteCacheManager remoteCacheManager) {

        if (DataGridCacheHelper.isCacheServerRunning()) {
            return remoteCacheManager.administration().getOrCreateCache(cacheName, DefaultTemplate.INVALIDATION_SYNC);
        } else {
            return null;
        }
    }

    public <K,V> boolean checkKeyInCache(RemoteCache<K,V> remoteCache, K key) {
        return DataGridCacheHelper.isCacheServerRunning() && remoteCache.get(key) != null;
    }


    public <K, V> void putValueInCacheSync(RemoteCache<K,V> remoteCache, K key, V value) {
        remoteCache.put(key, value);
    }

    public <K, V> void putValueinCacheAsync(RemoteCache<K,V> remoteCache, K key, V value) {
        remoteCache.putAsync(key, value);
    }

    public <K,V> Object getValueFromCache(RemoteCache<K,V> remoteCache, K key) {
        return remoteCache.get(key);
    }

    public <K,V> Object deleteValueFromCache(RemoteCache<K,V> remoteCache, K key){
        return remoteCache.remove(key);
    }

}
