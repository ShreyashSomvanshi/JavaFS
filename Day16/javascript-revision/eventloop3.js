console.log('start');

const interValid = setInterval(()=>{
    console.log('intervaal setinterval');
}, 0);

setTimeout(()=>{
    console.log('timeout settimeout');
    clearInterval(interValid);
}, 2);

console.log('end');




