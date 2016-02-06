# traveling_salesman_solver
Cli program to solve TSP by using the nearest neighbor algorithm. It does not give the exact optimal solution since it's basically impossible to calculate for a graph bigger than some 10-20 vertices. Nearest Neighbor (NN) usually gives a suboptimal solution, but it does it in milliseconds compared to exact algorithms that can take months or up to years to complete even smalls graphs.

This is a visual example of a complete undirected weighted graph. The travelling salesman problem (TSP) asks the following question: Given a list of cities and the distances between each pair of cities, what is the shortest possible route that visits each city exactly once and returns to the origin city? It is an NP-hard problem in combinatorial optimization, important in operations research and theoretical computer science.


![alt tag](https://github.com/paulyv/traveling_salesman_solver/raw/master/example_complete_undirected_weighted_graph.gif)

Below is a screenshot where I used my program to calculate the shortest round-trip between 15 largest cities in Finland and return back to the origin city.

![alt tag](https://github.com/paulyv/traveling_salesman_solver/raw/master/screenshot.png)

