import pandas as pd

data = pd.read_csv('HW2DataB.csv', delimiter =',')

print(data.tail(3))

num_rows, num_columns = data.shape
print(f"Number of rows: {num_rows}")
print(f"Number of columns: {num_columns}")

print("\nColumns with missing data:")
print(data.isnull().sum())

print("\nStatistical summaries of all columns:")
print(data.describe())


import pandas as pd

# Read the data from the CSV file into a Pandas DataFrame
data = pd.read_csv('HW2DataB.csv', delimiter=',')

# Identify the data types for each field based on values
data_types_based_on_values = data.dtypes

# Identify the data types in Python
data_types_in_python = dict(data.dtypes.apply(lambda x: x.name))

# Report the data types based on values
print("Data types based on values:")
print(data_types_based_on_values)

# Report the data types in Python
print("\nData types in Python:")
print(data_types_in_python)


import pandas as pd
from sklearn.preprocessing import MinMaxScaler, LabelEncoder

# Read the data from the CSV file into a Pandas DataFrame
data = pd.read_csv('HW2DataB.csv', delimiter=',')

# Remove the column named “Student ID” permanently from the data
data.drop(columns='StdID', inplace=True)

# Apply data transformation for each column
# Normalize the numeric columns using Min-Max scaling (except for 'Final' column)
numeric_columns = ['Weekly studying hours', 'Previous exams', 'Absences', 'Class size', 'Mid score', 'Project score']
scaler = MinMaxScaler()
data[numeric_columns] = scaler.fit_transform(data[numeric_columns])

# Encode categorical columns using Label Encoding
categorical_columns = ['Statistical background', 'Python background', 'Gender', 'Class level']
label_encoder = LabelEncoder()
for col in categorical_columns:
    data[col] = label_encoder.fit_transform(data[col])

# Display the summaries of all the columns in the transpose form
print(data.describe().T)


import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

# Read the data from the CSV file into a Pandas DataFrame
data = pd.read_csv('HW2DataB.csv', delimiter=',')

# Remove the column named “Student ID” permanently from the data
data.drop(columns='StdID', inplace=True)

# Relation plot
sns.pairplot(data)
plt.show()

# Distribution plot for all original numeric variables
# Select the original numeric columns (before normalization)
numeric_columns = ['Weekly studying hours', 'Previous exams', 'Absences', 'Class size', 'Mid score', 'Project score']

# Plot distribution for each numeric variable
plt.figure(figsize=(12, 8))
for i, col in enumerate(numeric_columns, 1):
    plt.subplot(2, 3, i)
    sns.histplot(data[col], kde=True)
    plt.xlabel(col)
plt.tight_layout()
plt.show()


import pandas as pd
import numpy as np
from sklearn.linear_model import RidgeCV
from sklearn.model_selection import cross_val_score
from sklearn.metrics import mean_squared_error

# Read the data from the CSV files into Pandas DataFrames
data_train = pd.read_csv('HW2DataB.csv', delimiter=',')
data_test = pd.read_csv('HW2DataC.csv', delimiter=',')

# Remove the column named “Student ID” permanently from the training and test data
data_train.drop(columns='StdID', inplace=True)
data_test.drop(columns='StdID', inplace=True)

# Separate explanatory variables (X_train, X_test) and target variable (Y_train)
X_train = data_train.drop(columns='Final')
X_test = data_test.drop(columns='Final')
Y_train = data_train['Final']

# Initialize RidgeCV with alpha values to be tested
alphas = [1e-3, 1e-2, 1e-1, 1e0, 1e1, 1e2, 1e3]
ridge_cv = RidgeCV(alphas=alphas, cv=7)

# Perform Ridge Regression with cross-validation
ridge_cv.fit(X_train, Y_train)

# Get the best alpha and the coefficient estimates
best_alpha = ridge_cv.alpha_
coefficients = ridge_cv.coef_

# Calculate the Mean Squared Error (MSE) for data in HW2DataC
Y_test = data_test['Final']
Y_pred = ridge_cv.predict(X_test)
mse_test = mean_squared_error(Y_test, Y_pred)

# Print the best alpha and the coefficient estimates
print("Best Alpha:", best_alpha)
print("Coefficient Estimates:", coefficients)

# Print the MSE for data in HW2DataC
print("MSE for data in HW2DataC:", mse_test)
