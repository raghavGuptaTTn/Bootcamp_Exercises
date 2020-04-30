/**
 * Q3. Create a markup template using string literal
const song = {
 name: 'Dying to live',
 artist: 'Tupac',
 featuring: 'Biggie Smalls'
};

 

Result:
"<div class="song">
   <p>
     Dying to live — Tupac
     (Featuring Biggie Smalls)
   </p>
 </div>
“
*/

const song = {
    name: 'Dying to live',
    artist: 'Tupac',
    featuring: 'Biggie Smalls'
   };


let result = `<div class="song">
<p>
  ${song.name} — ${song.artist}
  (Featuring ${song.featuring})
</p>
</div>`; 

export {result};


