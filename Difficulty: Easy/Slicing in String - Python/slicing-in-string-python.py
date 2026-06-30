# Function to join given bound_by and tag
def join_middle(bound_by, tag_name):
    n = len(bound_by)
    
    return bound_by[:n//2] + tag_name + bound_by[n//2:]