function fetchData(callback){
    setTimeout(()=>{
        console.log('data fetched ');
        callback(null, 'data');
    },1000);
};


function processData(data, callback){
    setTimeout(()=>{
        console.log('Data Processed: ', data);
        callback(null, 'processed data');
    },1000);
};

function saveData(data, callback){
    setTimeout(()=>{
        console.log('Data saved: ', data);
        callback(null, 'saved data');
    },1000);
};

fetchData(error, data){
    if(error){
        console.log('Error: ', error);
        return;
    }
    processData(data, (error, processData)=>{
        if (error){
            console.log('Error Processing', error);
            return;
        }

        saveData(processData, (error, saveData)={
            if (error){
                console.log('Error saving', error);
                return ;
            }
            
            console.log('final result', saveData);
            
        });
    });
};

