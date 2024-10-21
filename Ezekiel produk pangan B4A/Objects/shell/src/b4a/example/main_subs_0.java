package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
int _i = 0;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(1073741824);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="Name = Array As String(\"Kecap\",\"Tisu\",\"Ayam\",\"Ind";
Debug.ShouldStop(1);
main.mostCurrent._name = RemoteObject.createNewArray("String",new int[] {10},new Object[] {BA.ObjectToString("Kecap"),BA.ObjectToString("Tisu"),BA.ObjectToString("Ayam"),BA.ObjectToString("Indomie"),BA.ObjectToString("Telur"),BA.ObjectToString("Tepung"),BA.ObjectToString("Boncabe"),BA.ObjectToString("Beras"),BA.ObjectToString("Blue Band"),RemoteObject.createImmutable("Micin")});
 BA.debugLineNum = 34;BA.debugLine="Nomer = Array As String(\"12k\",\"7k\",\"1kg/32k\",\"3k\"";
Debug.ShouldStop(2);
main.mostCurrent._nomer = RemoteObject.createNewArray("String",new int[] {10},new Object[] {BA.ObjectToString("12k"),BA.ObjectToString("7k"),BA.ObjectToString("1kg/32k"),BA.ObjectToString("3k"),BA.ObjectToString("1kg/24k"),BA.ObjectToString("10k"),BA.ObjectToString("1k"),BA.ObjectToString("1kg/14k"),BA.ObjectToString("12k"),RemoteObject.createImmutable("500")});
 BA.debugLineNum = 35;BA.debugLine="Des = Array As String(\"Gak kecap gak manis\",\"Buat";
Debug.ShouldStop(4);
main.mostCurrent._des = RemoteObject.createNewArray("String",new int[] {10},new Object[] {BA.ObjectToString("Gak kecap gak manis"),BA.ObjectToString("Buat ngelap"),BA.ObjectToString("Tinggi Protein"),BA.ObjectToString("Cocok Untuk anak kost"),BA.ObjectToString("Tinggi protein"),BA.ObjectToString("Buat Temen ultah"),BA.ObjectToString("Kurang pedes? kasi ini aja"),BA.ObjectToString("Gak sego, gak jowo"),BA.ObjectToString("Pengganti minyak"),RemoteObject.createImmutable("Cocok Untuk generasi Milenial")});
 BA.debugLineNum = 37;BA.debugLine="For i = 0 To 9";
Debug.ShouldStop(16);
{
final int step5 = 1;
final int limit5 = 9;
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 38;BA.debugLine="lvSiswa.AddTwoLinesAndBitmap(Name(i),Nomer(i) &";
Debug.ShouldStop(32);
main.mostCurrent._lvsiswa.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(main.mostCurrent._name.getArrayElement(true,BA.numberCast(int.class, _i)))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._nomer.getArrayElement(true,BA.numberCast(int.class, _i)),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Selengkapnya..")))),(Object)((main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(RemoteObject.createImmutable(_i),RemoteObject.createImmutable(".png")))).getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 42;BA.debugLine="lvSiswa.TwoLinesAndBitmap.ItemHeight=150dip";
Debug.ShouldStop(512);
main.mostCurrent._lvsiswa.runMethod(false,"getTwoLinesAndBitmap").runMethod(true,"setItemHeight",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150))));
 BA.debugLineNum = 43;BA.debugLine="lvSiswa.TwoLinesAndBitmap.ImageView.Height=95dip";
Debug.ShouldStop(1024);
main.mostCurrent._lvsiswa.runMethod(false,"getTwoLinesAndBitmap").getField(false,"ImageView").runMethod(true,"setHeight",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 95))));
 BA.debugLineNum = 44;BA.debugLine="lvSiswa.TwoLinesAndBitmap.ImageView.Width=95dip";
Debug.ShouldStop(2048);
main.mostCurrent._lvsiswa.runMethod(false,"getTwoLinesAndBitmap").getField(false,"ImageView").runMethod(true,"setWidth",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 95))));
 BA.debugLineNum = 45;BA.debugLine="lvSiswa.TwoLinesAndBitmap.Label.Left=109dip";
Debug.ShouldStop(4096);
main.mostCurrent._lvsiswa.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setLeft",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 109))));
 BA.debugLineNum = 46;BA.debugLine="lvSiswa.TwoLinesAndBitmap.SecondLabel.Left=109dip";
Debug.ShouldStop(8192);
main.mostCurrent._lvsiswa.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setLeft",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 109))));
 BA.debugLineNum = 47;BA.debugLine="lvSiswa.TwoLinesAndBitmap.SecondLabel.Height= 150d";
Debug.ShouldStop(16384);
main.mostCurrent._lvsiswa.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setHeight",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150))));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,68);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 68;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,64);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 64;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,72);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 72;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(256);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private lvSiswa As ListView";
main.mostCurrent._lvsiswa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Public Name() As String";
main.mostCurrent._name = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 25;BA.debugLine="Public Nomer() As String";
main.mostCurrent._nomer = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 26;BA.debugLine="Public Des() As String";
main.mostCurrent._des = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 27;BA.debugLine="Public Sel() As String";
main.mostCurrent._sel = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lvsiswa_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lvSiswa_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,76);
if (RapidSub.canDelegate("lvsiswa_itemclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","lvsiswa_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 76;BA.debugLine="Private Sub lvSiswa_ItemClick (Position As Int, Va";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="xui.MsgboxAsync(Name(Position) & CRLF & Nomer(Pos";
Debug.ShouldStop(4096);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._name.getArrayElement(true,_position),main.mostCurrent.__c.getField(true,"CRLF"),main.mostCurrent._nomer.getArrayElement(true,_position),main.mostCurrent.__c.getField(true,"CRLF"),main.mostCurrent._des.getArrayElement(true,_position)))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("PRODUK"))));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}