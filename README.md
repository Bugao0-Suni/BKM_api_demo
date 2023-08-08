# BKM_api_demo
## Environment for JDK

### JDK uninstall
sudo rm -fr /Library/Internet\ Plug-Ins/JavaAppletPlugin.plugin
sudo rm -fr /Library/PreferencePanes/JavaControlPanel.prefPane
sudo rm -fr ~/Library/Application\ Support/Oracle/Java
sudo rm -rf /Library/Java/JavaVirtualMachines/
rm -rf /usr/local/Homebrew/Library/Taps/adoptopenjdk/homebrew-openjdk
brew info java
brew cleanup

### Setup $JAVA_HOME variable

export JAVA_HOME="/Library/Internet Plug-Ins/JavaAppletPlugin.plugin/Contents/Home"

export JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk-11.jdk/Contents/Home/"

export JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk-20.jdk/Contents/Home/"

## simple-demo
This is the project to verify the settings for running the Bookmap add-ons'
test project.

## hello-world