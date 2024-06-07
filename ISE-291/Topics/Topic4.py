import pandas as pd
## Example of loc and iloc
# df = pd.DataFrame([['a11', 'a12'], ['a21', 'a22']],
#                   index=['row 1', 'row 2'],
#                   columns=['col 1', 'col-2'])

# print(df)


# print(df.loc[:,'col 1'])  # Select one column

# print(df['col 1'])  # Select one column

# print(df.col-2) # # Select one column, problem is Spaces or Special characters

# print(df.loc['row 2','col 1'])

# print(df.loc['row 2',:])

# print(df['row 2']) ## check...


# print(df.iloc[:,0])  # Select one column

# print(df.iloc[1,0]) # row 2 column 1


# ============================================================================

# df = pd.read_csv('Basic-1.csv', delimiter=',')
# print(df.head())

# seleted_rows = df['Job Type']=='White-collar'
# print(df.loc[seleted_rows,:])

# ============================================================================


df = pd.read_csv('Basic-1.csv', delimiter=',')

seleted_rows = (df['Province']=='Eastern') & (df['Job Type']=='White-collar')
# print(df.loc[seleted_rows,:])


# Summary
# print(df.loc[seleted_rows,:].describe().iloc[:,0])
# print(df.loc[seleted_rows,:].describe())
# print(df.loc[seleted_rows,:].describe().loc[:,'Gender'])