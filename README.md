## Java calculator app

This is a simple calculator app with GUI just to test my skills. You are welcome to contribute to this project and write recommendations to improve it.

####Packages

* `com.murdad.calculator` - main calculating package. Does all calculations.
* `com.murdad.GUI` - User interface and mediator with `Calculator` package

#### Classes

* `com.murdad.App` - main entry point. All new buttons must be registered here
* `com.murdad.calculator.enums.Operations` - operations enums
* `com.murdad.GUI.Mediator` - main logic is concentrated here. UI is built in `createGUI()` method.
* `com.murdad.GUI.numers.*` - all numbers buttons and dot
* `com.murdad.GUI.operations.*` - all operations buttons