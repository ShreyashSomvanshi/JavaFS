setImmediate(() => {
    console.log("Outer setImmediate");
    setTimeout(() => {
      console.log("setTimeout inside setImmediate");
    }, 0);
    Promise.resolve().then(() => {
      console.log("Promise inside setImmediate");
    });
});

console.log("betwn");
   
setTimeout(() => {
    console.log("Outer setTimeout");
    setImmediate(() => {
      console.log("setImmediate inside setTimeout");
    });
}, 0);
   
console.log("main");

