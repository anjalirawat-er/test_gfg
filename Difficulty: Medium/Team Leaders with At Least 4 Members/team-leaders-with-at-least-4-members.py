import pandas as pd

class Solution:
    def teamLeaders(self, employee: pd.DataFrame) -> pd.DataFrame:
        leader_counts = employee['leaderId'].value_counts()
        
        valid_leaders = leader_counts[leader_counts >= 4].index
        
        result_df = employee[employee['id'].isin(valid_leaders)][['name']]
        
        result_df = result_df.reset_index(drop=True)
        
        return result_df