/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/alex/android/frameworks/base/core/java/android/hardware/display/IRemoteDisplayAdapter.aidl
 */
package android.hardware.display;
/**
 * @hide
 */
public interface IRemoteDisplayAdapter extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.display.IRemoteDisplayAdapter
{
private static final java.lang.String DESCRIPTOR = "android.hardware.display.IRemoteDisplayAdapter";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.display.IRemoteDisplayAdapter interface,
 * generating a proxy if needed.
 */
public static android.hardware.display.IRemoteDisplayAdapter asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.display.IRemoteDisplayAdapter))) {
return ((android.hardware.display.IRemoteDisplayAdapter)iin);
}
return new android.hardware.display.IRemoteDisplayAdapter.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_scanRemoteDisplays:
{
data.enforceInterface(DESCRIPTOR);
this.scanRemoteDisplays();
return true;
}
case TRANSACTION_connectRemoteDisplay:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.connectRemoteDisplay(_arg0);
return true;
}
case TRANSACTION_disconnectRemoteDisplay:
{
data.enforceInterface(DESCRIPTOR);
this.disconnectRemoteDisplay();
return true;
}
case TRANSACTION_forgetRemoteDisplay:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.forgetRemoteDisplay(_arg0);
return true;
}
case TRANSACTION_renameRemoteDisplay:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.renameRemoteDisplay(_arg0, _arg1);
return true;
}
case TRANSACTION_getRemoteDisplayStatus:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.display.WifiDisplayStatus _result = this.getRemoteDisplayStatus();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_registerDisplayDevice:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.display.IDisplayDevice _arg0;
_arg0 = android.hardware.display.IDisplayDevice.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
float _arg4;
_arg4 = data.readFloat();
int _arg5;
_arg5 = data.readInt();
java.lang.String _arg6;
_arg6 = data.readString();
boolean _arg7;
_arg7 = (0!=data.readInt());
this.registerDisplayDevice(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
return true;
}
case TRANSACTION_unregisterDisplayDevice:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.display.IDisplayDevice _arg0;
_arg0 = android.hardware.display.IDisplayDevice.Stub.asInterface(data.readStrongBinder());
this.unregisterDisplayDevice(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.display.IRemoteDisplayAdapter
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
// No permissions required.

@Override public void scanRemoteDisplays() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_scanRemoteDisplays, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Requires CONFIGURE_WIFI_DISPLAY permission to connect to an unknown device.
// No permissions required to connect to a known device.

@Override public void connectRemoteDisplay(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_connectRemoteDisplay, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// No permissions required.

@Override public void disconnectRemoteDisplay() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disconnectRemoteDisplay, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Requires CONFIGURE_WIFI_DISPLAY permission.

@Override public void forgetRemoteDisplay(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_forgetRemoteDisplay, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Requires CONFIGURE_WIFI_DISPLAY permission.

@Override public void renameRemoteDisplay(java.lang.String address, java.lang.String alias) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeString(alias);
mRemote.transact(Stub.TRANSACTION_renameRemoteDisplay, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// No permissions required.
/**
    /* @hide
    */
@Override public android.hardware.display.WifiDisplayStatus getRemoteDisplayStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.display.WifiDisplayStatus _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRemoteDisplayStatus, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.display.WifiDisplayStatus.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void registerDisplayDevice(android.hardware.display.IDisplayDevice device, java.lang.String name, int width, int height, float refreshRate, int flags, java.lang.String address, boolean hidden) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((device!=null))?(device.asBinder()):(null)));
_data.writeString(name);
_data.writeInt(width);
_data.writeInt(height);
_data.writeFloat(refreshRate);
_data.writeInt(flags);
_data.writeString(address);
_data.writeInt(((hidden)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_registerDisplayDevice, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void unregisterDisplayDevice(android.hardware.display.IDisplayDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((device!=null))?(device.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterDisplayDevice, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_scanRemoteDisplays = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_connectRemoteDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_disconnectRemoteDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_forgetRemoteDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_renameRemoteDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getRemoteDisplayStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_registerDisplayDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_unregisterDisplayDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
// No permissions required.

public void scanRemoteDisplays() throws android.os.RemoteException;
// Requires CONFIGURE_WIFI_DISPLAY permission to connect to an unknown device.
// No permissions required to connect to a known device.

public void connectRemoteDisplay(java.lang.String address) throws android.os.RemoteException;
// No permissions required.

public void disconnectRemoteDisplay() throws android.os.RemoteException;
// Requires CONFIGURE_WIFI_DISPLAY permission.

public void forgetRemoteDisplay(java.lang.String address) throws android.os.RemoteException;
// Requires CONFIGURE_WIFI_DISPLAY permission.

public void renameRemoteDisplay(java.lang.String address, java.lang.String alias) throws android.os.RemoteException;
// No permissions required.
/**
    /* @hide
    */
public android.hardware.display.WifiDisplayStatus getRemoteDisplayStatus() throws android.os.RemoteException;
public void registerDisplayDevice(android.hardware.display.IDisplayDevice device, java.lang.String name, int width, int height, float refreshRate, int flags, java.lang.String address, boolean hidden) throws android.os.RemoteException;
public void unregisterDisplayDevice(android.hardware.display.IDisplayDevice device) throws android.os.RemoteException;
}
