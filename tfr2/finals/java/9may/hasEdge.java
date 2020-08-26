public boolean hasEdge(int v, int w) {
    for (int u : G.adj[v])
        if (u == w) return true;
    return false
}
