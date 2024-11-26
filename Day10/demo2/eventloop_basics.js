setTimeout(()=>{
    console.log("setTimeout1");
},0);

setImmediate(()=>{
    console.log("immediate"); 
});

setTimeout(()=>{
    setImmediate(()=>{
        console.log('immed');
    });
    console.log("setTimeout2");
},200);