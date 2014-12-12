/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/chenty/workspace_adt/FibonacciCommon/src/com/example/fibonaccicommon/IFibonacciService.aidl
 */
package com.example.fibonaccicommon;
public interface IFibonacciService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.example.fibonaccicommon.IFibonacciService
{
private static final java.lang.String DESCRIPTOR = "com.example.fibonaccicommon.IFibonacciService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.example.fibonaccicommon.IFibonacciService interface,
 * generating a proxy if needed.
 */
public static com.example.fibonaccicommon.IFibonacciService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.example.fibonaccicommon.IFibonacciService))) {
return ((com.example.fibonaccicommon.IFibonacciService)iin);
}
return new com.example.fibonaccicommon.IFibonacciService.Stub.Proxy(obj);
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
case TRANSACTION_fibJR:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
long _result = this.fibJR(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_fibJI:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
long _result = this.fibJI(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_fibNR:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
long _result = this.fibNR(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_fibNI:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
long _result = this.fibNI(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_fib:
{
data.enforceInterface(DESCRIPTOR);
com.example.fibonaccicommon.FibonacciRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = com.example.fibonaccicommon.FibonacciRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
com.example.fibonaccicommon.FibonacciResponse _result = this.fib(_arg0);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.example.fibonaccicommon.IFibonacciService
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
@Override public long fibJR(long n) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(n);
mRemote.transact(Stub.TRANSACTION_fibJR, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long fibJI(long n) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(n);
mRemote.transact(Stub.TRANSACTION_fibJI, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long fibNR(long n) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(n);
mRemote.transact(Stub.TRANSACTION_fibNR, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long fibNI(long n) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(n);
mRemote.transact(Stub.TRANSACTION_fibNI, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.example.fibonaccicommon.FibonacciResponse fib(com.example.fibonaccicommon.FibonacciRequest request) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.example.fibonaccicommon.FibonacciResponse _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((request!=null)) {
_data.writeInt(1);
request.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_fib, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.example.fibonaccicommon.FibonacciResponse.CREATOR.createFromParcel(_reply);
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
}
static final int TRANSACTION_fibJR = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_fibJI = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_fibNR = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_fibNI = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_fib = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public long fibJR(long n) throws android.os.RemoteException;
public long fibJI(long n) throws android.os.RemoteException;
public long fibNR(long n) throws android.os.RemoteException;
public long fibNI(long n) throws android.os.RemoteException;
public com.example.fibonaccicommon.FibonacciResponse fib(com.example.fibonaccicommon.FibonacciRequest request) throws android.os.RemoteException;
}
