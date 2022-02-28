package org.evenos.factories;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.MOrder;
import org.compiere.model.PO;
import org.compiere.util.Env;

public class MyModelFactory implements IModelFactory
{
	@Override
	public Class<?> getClass(String tableName) {
		// TODO Auto-generated method stub
		
		if(tableName.equalsIgnoreCase(MOrder.Table_Name))
		{
			return MOrder.class;
		}
		
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		// TODO Auto-generated method stub
		
		if(tableName.equalsIgnoreCase(MOrder.Table_Name))
		{
			return new MOrder(Env.getCtx(), Record_ID, trxName);
		}
		
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		// TODO Auto-generated method stub
		
		if(tableName.equalsIgnoreCase(MOrder.Table_Name))
		{
			return new MOrder(Env.getCtx(), rs, trxName);
		}
		
		return null;
	}
	
}
