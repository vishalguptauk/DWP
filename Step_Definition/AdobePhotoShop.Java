
//Duje Roje "file.jsxinc"
//@target photoshop
//@targetengine "session"

//@targetengine "session_01"
//@target illustrator
//@include "mylib.jsx"

//need to register *.jsx file as javascript in Settings/File

targetengine
illustrator;

eval('#include ' + File($.fileName).path + '/lib.jsx')