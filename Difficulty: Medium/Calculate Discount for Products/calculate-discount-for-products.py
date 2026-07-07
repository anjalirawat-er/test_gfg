import pandas as pd
import numpy as np

class Solution:
    def calculateDiscount(self, products: pd.DataFrame) -> pd.DataFrame:
        is_even_id = (products['product_id'] % 2 == 0)
        starts_with_A = products['category'].str.startswith('A')
        
        products['discount'] = np.where(is_even_id & starts_with_A, products['price'], 0)
        
        result_df = products.sort_values(by='product_id', ascending=True)
        
        result_df = result_df[['product_id', 'discount']].reset_index(drop=True)
        
        return result_df