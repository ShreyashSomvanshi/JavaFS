function fetchData(success) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if (success) {
                resolve('data fetched');
            } else {
                reject('error');
            }
        }, 1000);
    });
}

async function getData(successArray) {
    try {
        console.log('fetching data');

        // Create an array of promises
        const promises = successArray.map(success => fetchData(success));

        // Wait for all promises to resolve or reject
        const results = await Promise.all(promises);
        
        // Log the results
        results.forEach(data => console.log(data));

    } catch (error) {
        console.log('caught an error', error);
    }
}

// Example usage with multiple success values
getData([true, true, false, true]);
