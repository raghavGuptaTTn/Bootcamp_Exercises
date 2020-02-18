public class Wordcount {

    public static void main(String []args) {

        String s = "the sun rises in the east The Sun is round Sun is bright east yellow in color it is yellow";
        s = s.toLowerCase();
        String words[] = s.split(" ");

//        for(int i=0; i<words.length; i++){
//            System.out.println(words[i]);
//        }

        for(int i = 0; i < words.length; i++){

            if (!words[i].equals("")) {
                int count = 1;
                for (int j = i+1; j < words.length; j++) {
                    if (words[j].equals(words[i])) {
                        count++;
                        words[j]="0";
                    }

                }

                if (count > 1 && words[i]!="0") {
                    System.out.println(words[i] + " " + count);
                    words[i] = "";
                }
            }
          }
        }
    }
