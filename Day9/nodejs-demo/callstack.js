function firstFun(){
    console.log('First Function started');
    secondFun(); // second in stack
    console.log('First Function ended');
    
}


function secondFun(){ 
    console.log('Second function started');
    
}


firstFun(); 

// firstFunc pushed in callstack, executes till started..
// secondfunc pushed in callstack, fully executes
// secod func popped out
// now again remaining first func executes ended...
// first func pops out
// callstack empty
// end

