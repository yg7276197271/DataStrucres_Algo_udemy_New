package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NMeetingsinOneRoom {

	static void maxMeetings(int start[], int end[], int n) {

		List<meeting> meetings = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			meetings.add(new meeting(start[i], end[i], i + 1));
		}
		Collections.sort(meetings, new MeetingComparator());
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(meetings.get(0).pos);

		int freeTimeOfMeeting = 0;
		for (int i = 1; i < meetings.size(); i++) {
			if ((int) meetings.get(i).getStart() > freeTimeOfMeeting) {
				freeTimeOfMeeting = meetings.get(i).getEnd();
				answer.add(meetings.get(i).pos);
			}
		}
		System.out.println("The order in which the meetings will be performed is ");
		for (int i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i) + " ");
		}

	}
	
	 public static void main(String args[])
	    {
	        int n = 6;
	        int start[] = {1,3,0,5,8,5};
	        int end[] = {2,4,5,7,9,9};
	        maxMeetings(start,end,n);
	        
	    }

}

class meeting {
	int start;
	int end;
	int pos;

	meeting(int start, int end, int pos) {
		this.start = start;
		this.end = end;
		this.pos = pos;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

}

class MeetingComparator implements Comparator<meeting> {

	@Override
	public int compare(meeting o1, meeting o2) {
		// TODO Auto-generated method stub

		if (o1.getEnd() > o2.getEnd())
			return 1;
		else if (o1.getEnd() < o2.getEnd())
			return -1;
		else if (o1.getPos() < o2.getPos())
			return -1; // in case end time is same
		else
			return 1;
	}

}