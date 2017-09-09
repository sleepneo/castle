package castle;

import java.util.HashMap;

public class Room 
{
    public String description;
    private HashMap<String, Room> exits = new HashMap<String, Room>();

    public Room(String description) 
    {
        this.description = description;
    }
    
    public void setExit(String dir, Room room)
    {
    	exits.put(dir, room);
    }

    @Override
    public String toString()
    {
        return description;
    }
    
    //返回所在房间出口信息
    public String getExitDesc()
    {
    	StringBuffer sb = new StringBuffer();
    	for(String dir : exits.keySet())
    	{
    		sb.append(dir);
    		sb.append(' ');
    	}
        return sb.toString();
    }
    
    public Room getExit(String direction)
    {
    	return exits.get(direction);
    }
}