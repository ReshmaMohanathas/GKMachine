# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
import pandas as pd 
import matplotlib.pyplot as plt
fig=plt.figure()

data=pd.read_csv("C:\\Users\\gokul\\OneDrive\\Documents\\Resh\\logs.csv",names=["Internal ID","CID","PID","Brand","APP Name","APP-Version","Platform","Card Type-Msg"])
data.drop("APP-Version",axis=1,inplace=True)
data.rename(columns={"Card Type-Msg":"Card_Type_Msg","APP Name":"APP_Name"},inplace=True)
data[["Card Type","Msg"]]=data.Card_Type_Msg.str.split("] -",expand=True)
data.drop("Card_Type_Msg",axis=1,inplace=True)
data["Platform"]=data["Platform"].str[10:]
data["APP_Name"]=data["APP_Name"].str[10:]
fig, (ax1,ax2)=plt.subplots(nrows=1,ncols=2)
data.groupby("Platform")["APP_Name"].count().plot(kind='bar',ax=ax2)
data.groupby(["Platform","APP_Name"])["APP_Name"].count().plot(kind='bar',color='red',ax=ax1)
data.groupby(["Brand","Card Type","Msg"])["PID"].count().plot()

