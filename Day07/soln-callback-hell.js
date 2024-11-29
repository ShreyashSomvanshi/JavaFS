function first(){
    return new Promise((resolve)=>{
        setTimeout(()=>{
            console.log('First func exec');
            
        }, 1000);
    });
}

function second(){
    return new Promise((resolve)=>{
        setTimeout(()=>{
            console.log('Second func exec');
            
        }, 1000);
    });
}

function third(callback){
    return new Promise((resolve)=>{
        setTimeout(()=>{
            console.log('Third func exec');
            callback()
        }, 1000);
    });
}

first().then(second).then(third).then(()=>{
    console.log('All func exec'); 
});