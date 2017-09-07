// var exec = require('cordova/exec');
module.exports = {
  sayHi: function(message, success, error) {
    console.log("in wwww");
    console.log(success);
      cordova.exec(success, error, "Greet", "sayHi", [message]);
  }
};
