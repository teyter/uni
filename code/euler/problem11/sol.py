import numpy as np

grid = np.loadtxt('grid.txt', dtype=int)
products = []

def rightleft(grid):
    for i in range(20):
        for j in range(16):
            products.append( grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+4] )

def updown(grid):
    for i in range(16):
        for j in range(20):
            products.append( grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j] )

def rdiag(grid):
    for i in range(16):
        for j in range(16):
            products.append( grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3] )

rightleft(grid)
updown(grid)
rdiag(grid)
# big brain time
rdiag(np.fliplr(grid)) # mirror grid and reuse rdiag
print('Answer:', max(products))
