
console.log("Start");
setTimeout(() => {
    console.log("Timeout1");
}, 0);

setTimeout(()=>{
    console.log("Timeout2");
}, 0);

console.log('End');

