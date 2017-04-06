package com.frameStudent.studentManage.beans;

public class Room {
	private int roomId;
	private String roomAddress;
	private int mayNum;
	private int yetNum;
	
	
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getRoomAddress() {
		return roomAddress;
	}
	public void setRoomAddress(String roomAddress) {
		this.roomAddress = roomAddress;
	}
	public int getMayNum() {
		return mayNum;
	}
	public void setMayNum(int mayNum) {
		this.mayNum = mayNum;
	}
	public int getYetNum() {
		return yetNum;
	}
	public void setYetNum(int yetNum) {
		this.yetNum = yetNum;
	}
	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomAddress=" + roomAddress + ", mayNum=" + mayNum + ", yetNum=" + yetNum
				+ "]";
	}
	
	
}
