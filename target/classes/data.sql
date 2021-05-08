DROP TABLE IF EXISTS Users;

CREATE TABLE Users (
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  pan VARCHAR(250) PRIMARY KEY
);

CREATE INDEX pan_index ON Users (pan);

INSERT INTO Users (first_name, last_name, pan) VALUES
  ('Vivek', 'Singh', 'IMAPQ80391'),
  ('username', 'lastname', 'IMAP808312'),
  ('test1', 'user', 'IMAP300300');