import java.util.HashMap;
import java.util.Stack;
class GraphDepthFirstPrint{
    public static void main(String[] args){
        HashMap<String, String[]> graph = new HashMap<String, String[]>();

        graph.put("A", new String[]{"B", "C"});
        graph.put("B", new String[]{"D"});
        graph.put("C", new String[]{"E"});
        graph.put("D", new String[]{"F"});
        graph.put("E", new String[]{});
        graph.put("F", new String[]{});

        dfs(graph,"A");
    }
    public static void dfs(HashMap<String,String[]> graph, String source){
        Stack stack = new Stack();
        stack.push(source);
        while(stack.size() > 0){
            String current = stack.pop().toString();
            System.out.println(current);
            for(String neighbor : graph.get(current)){
                stack.push(neighbor);
            }
        }
    }
}