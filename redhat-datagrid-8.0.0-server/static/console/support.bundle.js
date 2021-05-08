(window["webpackJsonp"] = window["webpackJsonp"] || []).push([[1],{

/***/ 673:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
// ESM COMPAT FLAG
__webpack_require__.r(__webpack_exports__);

// EXPORTS
__webpack_require__.d(__webpack_exports__, "Support", function() { return /* binding */ Support; });

// EXTERNAL MODULE: ./node_modules/react/index.js
var react = __webpack_require__(1);

// EXTERNAL MODULE: ./node_modules/@patternfly/react-icons/dist/esm/icons/cubes-icon.js
var cubes_icon = __webpack_require__(671);

// EXTERNAL MODULE: ./node_modules/@patternfly/react-core/dist/esm/components/Page/PageSection.js
var PageSection = __webpack_require__(672);

// EXTERNAL MODULE: ./node_modules/@patternfly/react-core/dist/esm/components/EmptyState/EmptyState.js
var EmptyState = __webpack_require__(666);

// EXTERNAL MODULE: ./node_modules/@patternfly/react-core/dist/esm/components/EmptyState/EmptyStateIcon.js
var EmptyStateIcon = __webpack_require__(667);

// EXTERNAL MODULE: ./node_modules/@patternfly/react-core/dist/esm/components/Title/Title.js
var Title = __webpack_require__(668);

// EXTERNAL MODULE: ./node_modules/@patternfly/react-core/dist/esm/components/EmptyState/EmptyStateBody.js
var EmptyStateBody = __webpack_require__(670);

// EXTERNAL MODULE: ./node_modules/@patternfly/react-core/dist/esm/components/Button/Button.js
var Button = __webpack_require__(669);

// EXTERNAL MODULE: ./node_modules/prop-types/index.js
var prop_types = __webpack_require__(0);
var prop_types_default = /*#__PURE__*/__webpack_require__.n(prop_types);

// EXTERNAL MODULE: ./node_modules/@patternfly/react-styles/dist/esm/StyleSheet.js
var StyleSheet = __webpack_require__(77);

// EXTERNAL MODULE: ./node_modules/@patternfly/react-styles/css/components/EmptyState/empty-state.js
var empty_state = __webpack_require__(99);
var empty_state_default = /*#__PURE__*/__webpack_require__.n(empty_state);

// CONCATENATED MODULE: ./node_modules/@patternfly/react-core/dist/esm/components/EmptyState/EmptyStateSecondaryActions.js


function _extends() { _extends = Object.assign || function (target) { for (var i = 1; i < arguments.length; i++) { var source = arguments[i]; for (var key in source) { if (Object.prototype.hasOwnProperty.call(source, key)) { target[key] = source[key]; } } } return target; }; return _extends.apply(this, arguments); }

function _objectWithoutProperties(source, excluded) { if (source == null) return {}; var target = _objectWithoutPropertiesLoose(source, excluded); var key, i; if (Object.getOwnPropertySymbols) { var sourceSymbolKeys = Object.getOwnPropertySymbols(source); for (i = 0; i < sourceSymbolKeys.length; i++) { key = sourceSymbolKeys[i]; if (excluded.indexOf(key) >= 0) continue; if (!Object.prototype.propertyIsEnumerable.call(source, key)) continue; target[key] = source[key]; } } return target; }

function _objectWithoutPropertiesLoose(source, excluded) { if (source == null) return {}; var target = {}; var sourceKeys = Object.keys(source); var key, i; for (i = 0; i < sourceKeys.length; i++) { key = sourceKeys[i]; if (excluded.indexOf(key) >= 0) continue; target[key] = source[key]; } return target; }




const EmptyStateSecondaryActions = (_ref) => {
  let {
    children = null,
    className = ''
  } = _ref,
      props = _objectWithoutProperties(_ref, ["children", "className"]);

  return react["createElement"]("div", _extends({
    className: Object(StyleSheet["b" /* css */])(empty_state_default.a.emptyStateSecondary, className)
  }, props), children);
};
EmptyStateSecondaryActions.propTypes = {
  children: prop_types_default.a.node,
  className: prop_types_default.a.string
};
//# sourceMappingURL=EmptyStateSecondaryActions.js.map
// CONCATENATED MODULE: ./src/app/Support/Support.tsx



var Support = function (props) {
    return (react["createElement"](PageSection["a" /* PageSection */], null,
        react["createElement"](EmptyState["a" /* EmptyState */], { variant: EmptyState["b" /* EmptyStateVariant */].full },
            react["createElement"](EmptyStateIcon["a" /* EmptyStateIcon */], { icon: cubes_icon["a" /* default */] }),
            react["createElement"](Title["a" /* Title */], { headingLevel: "h5", size: "lg" }, "Empty State (Stub Support Module)"),
            react["createElement"](EmptyStateBody["a" /* EmptyStateBody */], null, "This represents an the empty state pattern in Patternfly 4. Hopefully it's simple enough to use but flexible enough to meet a variety of needs."),
            react["createElement"](Button["a" /* Button */], { variant: "primary" }, "Primary Action"),
            react["createElement"](EmptyStateSecondaryActions, null,
                react["createElement"](Button["a" /* Button */], { variant: "link" }, "Multiple"),
                react["createElement"](Button["a" /* Button */], { variant: "link" }, "Action Buttons"),
                react["createElement"](Button["a" /* Button */], { variant: "link" }, "Can"),
                react["createElement"](Button["a" /* Button */], { variant: "link" }, "Go here"),
                react["createElement"](Button["a" /* Button */], { variant: "link" }, "In the secondary"),
                react["createElement"](Button["a" /* Button */], { variant: "link" }, "Action area")))));
};



/***/ })

}]);
//# sourceMappingURL=support.bundle.js.map