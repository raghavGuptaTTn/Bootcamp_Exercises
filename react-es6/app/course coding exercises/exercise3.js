/*
##Coding Exercise: Does this Word Contain this Letter? (Sets)

Let's implement our own version of String.includes()!

Directions: Make two changes to the given contains function. Convert the letters array split on the argued words to a set of unique characters. Then return (a true/false value) based whether or not the set has the argued letter.
 */
// solution
const contains = (word, letter) => {
    let letters = word.split("");
    let letterSet = new Set(letters);
    return letterSet.has(letter);
  };
  
let true_check = contains("west", "e");
let false_check = contains("north", "e");

console.log(true_check);
console.log(false_check);
