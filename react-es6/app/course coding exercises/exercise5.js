/**
 ##Coding Exercise: How Many Times Does this Letter Appear? (Maps)
 
Let's count some letters in Mary Poppins's favorite word: supercalifragilisticexpialidocious.

Directions: Address the three todos to fix the countLetter function. First, create the 'letters' map. Secondly, add a letter to the map if it doesn't exist in the map yet. Finally, update any encountered letters if they already exist in the map.

Note: Don't delete the last two lines, as the exercise will test if your method returns the correct count for 'a', and the correct count for 'x'.
 */
//solution


let string = 'supercalifragilisticexpialidocious';

const countLetter = (word, orig_letter) => {
  let letters = new Map();
  for (let i=0; i<word.length; i++) {
    let letter = word[i];
    if (!letters.has(letter)) {
      letters.set(letter, 1);
    } else {
      letters.set(letter, letters.get(letter) + 1);
    }
  }
  return letters.get(orig_letter);
};

console.log(countLetter(string, 'a'));
console.log(countLetter(string, 'x'));
