import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrisonCells {

	public static void main(String[] args) {
		PrisonCells prisonCells=new PrisonCells();
		int cells[]= {0,1,0,1,1,0,0,1};
		int n=101;
		prisonCells.prisonAfterNDays(cells, n);		

	}
	public int[] prisonAfterNDays(int[] cells, int N) {
        Map<String, Integer> _map = new HashMap();
        for(int i = 0; i < N; ++i){
            String s = Arrays.toString(cells);
            if(_map.containsKey(s)){
                int loop_length = i - _map.get(s);
                int remaining_days = (N - i) % loop_length;
                return prisonAfterNDays(cells, remaining_days);
            } else {
                _map.put(s, i);
                int prev = cells[0];
                for(int j = 1; j < 7; ++j){
                    int next = cells[j+1];
                    int curr = cells[j];
                    cells[j] = 1-(prev ^ next);
                    prev = curr;
                }
            }
            cells[0] = 0;
            cells[7] = 0;
        }
        return cells;
    }
    
	

}
