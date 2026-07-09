import pandas as pd

class Solution:
    def frequent_commenters(self, df: pd.DataFrame) -> pd.DataFrame:
        # 1. Filter rows where author commented on their own article
        own_comments = df[df['author_id'] == df['viewer_id']]
        
        # 2. Group by author_id and find counts of these comments
        comment_counts = own_comments.groupby('author_id').size().reset_index(name='count')
        
        # 3. Filter for authors who commented more than once
        frequent_authors = comment_counts[comment_counts['count'] > 1]
        
        # 4. Format output: select column, rename it, and sort
        result = frequent_authors[['author_id']].rename(columns={'author_id': 'id'})
        result = result.sort_values(by='id').reset_index(drop=True)
        
        return result