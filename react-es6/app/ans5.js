const allCombinations = (str) => {
    let compute = (current, string, arr) => {
        if (!current && !string){
            return;
        }
        if (!string) {
            arr.push(current);    
        } 
        else {
            compute(current + string[0], string.slice(1), arr);
            compute(current, string.slice(1), arr);
        }
        return arr;
    }
    return compute("", str, []);
}

export {allCombinations};
