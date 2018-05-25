


// Simple Implementation with Array
// Example : 
// ( )  : vertex
// ---- : edge
// --1-- : edge with weight (1)
//
// (0)-------1--------(1)
//  |\-------2----(2)------2------(3)
//  |--------------10-------------/

public class djikstraTutorial{
    public static void main (String[] args){


        // Variables (input)
        int size = 4;
        int[][] route;
        int start, finish;

        // Variables (tables)
        int destination, currVert;
        int newEdge;
        int[] edge;

        // Define array
        edge = new int[size];
        route = new int[size][size];


        //1. Initialization the route
        route[0][1] = 1;
        route[0][2] = 2;
        route[0][3] = 10;
        route[2][3] = 2;

        //2. Mention the start and finish
        start = 0;
        finish = 11;

        //3. Start tables
        for (int i=0;i<size;i++){
            currVert = i;
            for (int j=0;j<size;j++){
                destination = j;
                if(destination != start){// code will know where you will start
                    if(route[currVert][destination] != 0){
                        newEdge = edge[currVert] + route[currVert][destination];

                        // for the next tables
                        if(newEdge <= edge[destination]){ // found the shorter way
                            edge[destination] = newEdge;
                        }
                        else edge[destination] = newEdge;
                        // else edge[destination]
                    }
                }
            }
        }
        System.out.println(edge[finish]);
    }
}