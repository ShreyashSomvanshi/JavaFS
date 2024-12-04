console.log('start'); //1

setTimeout(()=>{
    console.log('inside settimeout macrotask 1'); //3
},0); // this is sent to webapi, not in callstack

setTimeout(()=>{ // macrotasks
    console.log('inside settimeout 2 macrotask 2'); //3
},0); // this is sent to webapi, not in callstack

Promise.resolve().then(()=>{ // microstask queue
    console.log('inside promise 1 microtask 1');    
});

Promise.resolve().then(()=>{ // microstask queue
    console.log('inside promise 2 microtask 2');    
});

console.log("End"); //2


