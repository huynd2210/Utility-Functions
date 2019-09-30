//Each Element in resultList is one line in text file    

public static ArrayList<String> readFromFile() {
        String fileName = "";  //<-- Insert file path
        String line = null;
        ArrayList<String> resultList= new ArrayList<String>();
        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null){
                resultList.add(line);
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("File not found");
        }
        catch(IOException ex){
            System.out.println("Error reading File");
        }
        return resultList;
    }
