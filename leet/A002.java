import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class A002 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal =  new ArrayList<List<Integer>>(); 
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0; i<numRows; i++){
            row.add(0,1);
            for(int j=1; j<row.size()-1; j++){
                row.set(j,row.get(j) + row.get(j+1));
            }
            pascal.add(new ArrayList<Integer>(row));
        }
        return pascal;
    }
    
    public void main(String[] args) {
        List<List<Integer>> result = generate(Integer.parseInt(args[0]));
        for (int i=0; i<result.size(); i++) {
            List<Integer> current = result.get(i);
            System.out.println(Arrays.toString(current.toArray()));
        }
    }
}
                           