import java.io.IOException;

import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;

import org.apache.hadoop.hbase.TableName;

import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;

import org.apache.hadoop.hbase.util.Bytes;

public class TablePartA{

   public static void main(String[] args) throws IOException {
      //to do 
      //first table "powers"
      //instantiating configuration class
      Configuration con = HBaseConfiguration.create();

      //Instantiating HbaseAdmin class
      HBaseAdmin admin = new HbaseAdmin(con);

      //Instantiating table descriptor class 
      HTableDescriptor tableDescriptor = new
      HTableDescriptor(TableName.valueOf("powers"));

      //adding column families to table descriptor 
      tableDescriptor.addFamily(new HColumnDescriptor("personal"));
      tableDescriptor.addFamily(new HColumnDescriptor("professional"));
      tableDescriptor.addFamily(new HColumnDescriptor("custom"));

      //Execute the table through admin 
      admin.createTable(tableDescriptor);
      System.out.println("Table created");
      
      //***********************************************
      //second table "food"
      //instantiating configuration class
      Configuration con1 = HBaseConfiguration.create();

      //Instantiating HbaseAdmin class
      HBaseAdmin admin1 = new HbaseAdmin(con1);

      //Instantiating table descriptor class 
      HTableDescriptor tableDescriptor1 = new
      HTableDescriptor(TableName.valueOf("food"));

      //adding column families to table descriptor 
      tableDescriptor1.addFamily(new HColumnDescriptor("nutrition"));
      tableDescriptor1.addFamily(new HColumnDescriptor("taste"));

      //Execute the table through admin 
      admin1.createTable(tableDescriptor1);
      System.out.println("Table created");


	
   }
}

