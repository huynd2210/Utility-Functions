#faster flood fill without memory issue
def scanlineFill(grid, i, j, new):
    stack = [(i, j)]
    area = 0
    pointsArea = {}
    points = []
    while stack:
        i, j = stack.pop()

        # scan left
        while j > 0 and grid[i][j - 1] != new:
            j -= 1

        while j < len(grid[0]) and grid[i][j] != new:
            grid[i][j] = new
            area += 1
            points.append((i,j))

            if i > 0 and grid[i - 1][j] != new:
                stack.append((i - 1, j))  # Add the point above to the stack

            if i < len(grid) - 1 and grid[i + 1][j] != new:
                stack.append((i + 1, j))  # Add the point below to the stack
            j += 1
    
    for point in points:
        pointsArea[point] = area

    return pointsArea
