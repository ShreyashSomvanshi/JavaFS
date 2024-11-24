function first(callback){
    setTimeout(()=>{
        console.log("first function");
        callback();
    }, 1000)
}

function second(callback){
    setTimeout(()=>{
        console.log("sec function");
        callback();
    }, 1000)
}

function third(callback){
    setTimeout(()=>{
        console.log("third function");
        callback();
    }, 1000);
}

first(()=>{
    second(()=>{
        third(()=>{
            console.log("All executed");
            
        });
    });
});