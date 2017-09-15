package net.media.training.designpattern.adapter;

import net.media.training.designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

/**
 * Created by nitesh.u on 21/07/17.
 */
public class LeavedetsailAdopter implements LeaveRecord {
    ThirdPartyLeaveRecord thirdPartyLeaveRecord;

    public LeavedetsailAdopter() {
        thirdPartyLeaveRecord = new ThirdPartyLeaveRecord();
    }

    public String getMostAbsentEmployee() {
        return thirdPartyLeaveRecord.getMostAbsentEmployee().getName();
    }


    public int getEmployeeAbsences(String employeeName) {

        return thirdPartyLeaveRecord.getEmployeeAbsences();
    }
}
