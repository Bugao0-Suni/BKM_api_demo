# Bookmap API package: simple-demo 
This project contains custom modules developed using the new Bookmap API. It can be used as examples, but may also contain quite useful indicators and strategies, i.e. not for demo purpose only.

# About the API
See highlights on Bookmap forum: https://www.bookmap.com/forum/viewtopic.php?f=20&t=46. You are welcome to reply with questions or suggestions.

# Requirements
Since the API wasn't yet published officially, it requires a newer installer (unpublished yet) and enabling your license for using API modules. If you wish to try it before the official release, please reply on the forum

# error
```bash
java.lang.NullPointerException: Cannot invoke "java.awt.Container.repaint()" because the return value of "com.bookmap.api.simple.demo.utils.gui.BookmapSettingsPanel.getParent()" is null
	at com.bookmap.api.simple.demo.strategies.StopLossRandomizerSettings$1.actionPerformed(StopLossRandomizerSettings.java:81)
	at java.desktop/javax.swing.AbstractButton.fireActionPerformed(Unknown Source)
	at java.desktop/javax.swing.AbstractButton$Handler.actionPerformed(Unknown Source)
	at java.desktop/javax.swing.DefaultButtonModel.fireActionPerformed(Unknown Source)
	at java.desktop/javax.swing.DefaultButtonModel.setPressed(Unknown Source)
	at java.desktop/javax.swing.plaf.basic.BasicButtonListener.mouseReleased(Unknown Source)
	at java.desktop/java.awt.AWTEventMulticaster.mouseReleased(Unknown Source)
	at java.desktop/java.awt.Component.processMouseEvent(Unknown Source)
	at java.desktop/javax.swing.JComponent.processMouseEvent(Unknown Source)
	at java.desktop/java.awt.Component.processEvent(Unknown Source)
	at java.desktop/java.awt.Container.processEvent(Unknown Source)
	at java.desktop/java.awt.Component.dispatchEventImpl(Unknown Source)
	at java.desktop/java.awt.Container.dispatchEventImpl(Unknown Source)
	at java.desktop/java.awt.Component.dispatchEvent(Unknown Source)
	at java.desktop/java.awt.LightweightDispatcher.retargetMouseEvent(Unknown Source)
	at java.desktop/java.awt.LightweightDispatcher.processMouseEvent(Unknown Source)
	at java.desktop/java.awt.LightweightDispatcher.dispatchEvent(Unknown Source)
	at java.desktop/java.awt.Container.dispatchEventImpl(Unknown Source)
	at java.desktop/java.awt.Window.dispatchEventImpl(Unknown Source)
	at java.desktop/java.awt.Component.dispatchEvent(Unknown Source)
	at java.desktop/java.awt.EventQueue.dispatchEventImpl(Unknown Source)
	at java.desktop/java.awt.EventQueue$4.run(Unknown Source)
	at java.desktop/java.awt.EventQueue$4.run(Unknown Source)
	at java.base/java.security.AccessController.doPrivileged(Unknown Source)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
	at java.desktop/java.awt.EventQueue$5.run(Unknown Source)
	at java.desktop/java.awt.EventQueue$5.run(Unknown Source)
	at java.base/java.security.AccessController.doPrivileged(Unknown Source)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(Unknown Source)
	at java.desktop/java.awt.EventQueue.dispatchEvent(Unknown Source)
	at velox.ib.N.dispatchEvent(SourceFile:73)
	at java.desktop/java.awt.EventDispatchThread.pumpOneEventForFilters(Unknown Source)
	at java.desktop/java.awt.EventDispatchThread.pumpEventsForFilter(Unknown Source)
	at java.desktop/java.awt.EventDispatchThread.pumpEventsForHierarchy(Unknown Source)
	at java.desktop/java.awt.EventDispatchThread.pumpEvents(Unknown Source)
	at java.desktop/java.awt.EventDispatchThread.pumpEvents(Unknown Source)
	at java.desktop/java.awt.EventDispatchThread.run(Unknown Source)
```