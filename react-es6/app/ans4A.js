// Q4. Extract all keys inside address object from user object using destructuring ?

const user = {
firstName: 'Sahil',
lastName: 'Dua',
Address: {
Line1: 'address line 1',
Line2: 'address line 2',
State: 'Delhi',
Pin: 110085,
Country: 'India',
City: 'New Delhi',
},
phoneNo: 9999999999
}

// one way - 
const { Address } = user;
const { 
Line1, Line2, State, Pin, Country, City
} = Address;

console.log(Line1, Line2, State, Pin, Country, City);


// another way - 
// const { 
//     Line1, Line2, State, Pin, Country, City
//     } = user.Address;
// console.log(Line1, Line2, State, Pin, Country, City);
