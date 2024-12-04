console.log('start'); //1

setTimeout(()=>{
    console.log('inside settimeout '); //3
},0); // this is sent to webapi, not in callstack

setTimeout(()=>{ // macrotasks
    console.log('inside settimeout 2'); //3
},0); // this is sent to webapi, not in callstack


Promise.resolve().then(()=>{ // microstask queue
    console.log('inside promise 1');    
})

console.log("End"); //2




