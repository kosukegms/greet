#import <Foundation/Foundation.h>
#import <Cordova/CDV.h>

@interface Greet : CDVPlugin

- (void) sayHi:(CDVInvokedUrlCommand *) command;

@end
