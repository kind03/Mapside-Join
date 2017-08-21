import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MultipleReducer extends Reducer<Text,Text,Text,Text>
{
	Text valEmit = new Text();
	String merge = "";
	public void reduce(Text key, Iterable<Text> values, Context context)
			throws IOException , InterruptedException
			{
		for(Text value:values)
		{
			if (value.toSring().substring(0,1).equals("1")) {
				String tb1 = value.toString();
			} else if (value.toSring().substring(0,1).equals("2")) {
				String tb2 = value.toString();
			}
		}
		valEmit.set(tb1+","+tb2);
		context.write(key, valEmit);
	}
}
