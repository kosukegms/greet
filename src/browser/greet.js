
var greets = {
  sayHi: function(success, error, message) {
        console.log("in browser");

        success(message);
        error(message);

  }
};

require('cordova/exec/proxy').add('greet', greets);
