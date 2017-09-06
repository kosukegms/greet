var exec = require('cordova/exec');

exports.greet = function(message, success, error) {
    exec(success, error, "Hello", "greet", [message]);
};
