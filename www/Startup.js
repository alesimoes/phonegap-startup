function Startup() {
}

Startup.prototype.show = function (message, duration, position, successCallback, errorCallback) {
  cordova.exec(successCallback, errorCallback, "Startup", "show", [message, duration, position]);
};


Startup.install = function () {
  if (!window.plugins) {
    window.plugins = {};
  }

  window.plugins.Startup = new Startup();
  return window.plugins.Startup;
};

cordova.addConstructor(Startup.install);