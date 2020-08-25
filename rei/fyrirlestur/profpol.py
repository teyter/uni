import math as m, polhnit as p

x,y = p.pol2rec(1, m.pi/6)
print(f'xy-hnit: ({x:.4}, {y:.4})')

r,theta = p.rec2pol(1,1)
g = m.degrees(theta)
print(f'Pólhnit: ({r:.4f}, {g:.2f}°)')
